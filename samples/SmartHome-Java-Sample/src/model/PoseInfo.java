package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import maejava.IMovement;
import maejava.ISymbol;
import maejava.LabanSequence;
import maejava.Movement;

public class PoseInfo {

	Map<Integer, ISymbol> poseMap;
	Set<Integer> bodyPartsSet;

	public PoseInfo(Map<Integer, ISymbol> poseMap) {
		this.poseMap = poseMap;
		bodyPartsSet = new HashSet<Integer>();

		for (Entry<Integer, ISymbol> entry : poseMap.entrySet()) {
			bodyPartsSet.add(entry.getKey());
		}
	}

	public PoseInfo(LabanSequence sequence) {
		for (int i = 0; i < sequence.getColumns().size(); i++) {
			Integer bodyPart = sequence.getColumns().get(i);

			bodyPartsSet.add(bodyPart);
			
			if (sequence.getColumnMovements(bodyPart).size() > 0) {
				IMovement imov = sequence.getColumnMovements(bodyPart).get(
						(int) sequence.getColumnMovements(bodyPart).size() - 1);

				if (imov instanceof Movement) {
					Movement mov = (Movement) imov;

					poseMap.put(bodyPart, mov.getSymbol());
					bodyPartsSet.add(bodyPart);
				} else {
					// TODO remove
					System.err.println("Cannot cast IMovement to Movement...");
				}
			}
		}
	}

	public PoseInfo() {
		poseMap = new HashMap<Integer, ISymbol>();
	}

	public void setBodyPartPose(Integer bodyPart, ISymbol pose) {
		poseMap.put(bodyPart, pose);
		bodyPartsSet.add(bodyPart);
	}

	public ISymbol getBodyPartPose(Integer bodyPart) {
		return poseMap.get(bodyPart);
	}

	public boolean matchingPose(LabanSequence currentSequence) {

		for (Integer bodyPart : bodyPartsSet) {
			if (currentSequence.getColumnMovements(bodyPart).size() == 0) {
				if (poseMap.get(bodyPart) != null)
				{
					return false;
				}
			} else {
				IMovement imov = currentSequence.getColumnMovements(bodyPart)
						.get((int) (currentSequence
								.getColumnMovements(bodyPart).size() - 1));
				if (imov instanceof Movement) {
					Movement mov = (Movement) imov;
					if (!mov.getSymbol().equals(poseMap.get(bodyPart))) {
						return false;
					}
				} else {
					// TODO remove
					System.err.println("IMovement is no Movement...");
					return false;
				}
			}
		}

		return true;
	}

}
