/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package maejava;

public class laban_sequence {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected laban_sequence(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(laban_sequence obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        w_e_boneJNI.delete_laban_sequence(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    w_e_boneJNI.laban_sequence_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    w_e_boneJNI.laban_sequence_change_ownership(this, swigCPtr, true);
  }

  public laban_sequence() {
    this(w_e_boneJNI.new_laban_sequence__SWIG_0(), true);
    w_e_boneJNI.laban_sequence_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public laban_sequence(String title, String author, long measures, e_time_unit time_unit, long beat_duration, long beats) {
    this(w_e_boneJNI.new_laban_sequence__SWIG_1(title, author, measures, time_unit.swigValue(), beat_duration, beats), true);
    w_e_boneJNI.laban_sequence_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public String get_version() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_version(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_versionSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_authors(string_vector authors) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_authors(swigCPtr, this, string_vector.getCPtr(authors), authors); else w_e_boneJNI.laban_sequence_set_authorsSwigExplicitlaban_sequence(swigCPtr, this, string_vector.getCPtr(authors), authors);
  }

  public void add_author(String author) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_add_author(swigCPtr, this, author); else w_e_boneJNI.laban_sequence_add_authorSwigExplicitlaban_sequence(swigCPtr, this, author);
  }

  public string_vector get_authors() {
    return new string_vector((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_authors(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_authorsSwigExplicitlaban_sequence(swigCPtr, this), true);
  }

  public void set_title(String title) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_title(swigCPtr, this, title); else w_e_boneJNI.laban_sequence_set_titleSwigExplicitlaban_sequence(swigCPtr, this, title);
  }

  public String get_title() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_title(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_titleSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_description(String description) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_description(swigCPtr, this, description); else w_e_boneJNI.laban_sequence_set_descriptionSwigExplicitlaban_sequence(swigCPtr, this, description);
  }

  public String get_description() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_description(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_descriptionSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_measures(long measures) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_measures(swigCPtr, this, measures); else w_e_boneJNI.laban_sequence_set_measuresSwigExplicitlaban_sequence(swigCPtr, this, measures);
  }

  public long get_measures() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_measures(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_measuresSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_time_unit(e_time_unit time_unit) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_time_unit(swigCPtr, this, time_unit.swigValue()); else w_e_boneJNI.laban_sequence_set_time_unitSwigExplicitlaban_sequence(swigCPtr, this, time_unit.swigValue());
  }

  public e_time_unit get_time_unit() {
    return e_time_unit.swigToEnum((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_time_unit(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_time_unitSwigExplicitlaban_sequence(swigCPtr, this));
  }

  public void set_beat_duration(long beat_duration) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_beat_duration(swigCPtr, this, beat_duration); else w_e_boneJNI.laban_sequence_set_beat_durationSwigExplicitlaban_sequence(swigCPtr, this, beat_duration);
  }

  public long get_beat_duration() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_beat_duration(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_beat_durationSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_beats(long beats) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_beats(swigCPtr, this, beats); else w_e_boneJNI.laban_sequence_set_beatsSwigExplicitlaban_sequence(swigCPtr, this, beats);
  }

  public long get_beats() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_beats(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_beatsSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void set_column_definitions(coldef_vector col_defs) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_column_definitions(swigCPtr, this, coldef_vector.getCPtr(col_defs), col_defs); else w_e_boneJNI.laban_sequence_set_column_definitionsSwigExplicitlaban_sequence(swigCPtr, this, coldef_vector.getCPtr(col_defs), col_defs);
  }

  public void add_column_definition(column_definition col_def) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_add_column_definition(swigCPtr, this, column_definition.getCPtr(col_def), col_def); else w_e_boneJNI.laban_sequence_add_column_definitionSwigExplicitlaban_sequence(swigCPtr, this, column_definition.getCPtr(col_def), col_def);
  }

  public coldef_vector get_column_definitions() {
    return new coldef_vector((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_column_definitions(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_column_definitionsSwigExplicitlaban_sequence(swigCPtr, this), true);
  }

  public column_definition get_column_definition(int column_index) {
    long cPtr = (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_column_definition(swigCPtr, this, column_index) : w_e_boneJNI.laban_sequence_get_column_definitionSwigExplicitlaban_sequence(swigCPtr, this, column_index);
    return (cPtr == 0) ? null : new column_definition(cPtr, true);
  }

  public void clear_column_definitions() {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_clear_column_definitions(swigCPtr, this); else w_e_boneJNI.laban_sequence_clear_column_definitionsSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public int_vector get_columns() {
    return new int_vector((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_columns(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_columnsSwigExplicitlaban_sequence(swigCPtr, this), true);
  }

  public void set_movements(i_mov_vector movements) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_set_movements(swigCPtr, this, i_mov_vector.getCPtr(movements), movements); else w_e_boneJNI.laban_sequence_set_movementsSwigExplicitlaban_sequence(swigCPtr, this, i_mov_vector.getCPtr(movements), movements);
  }

  public i_mov_vector get_movements() {
    return new i_mov_vector((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_movements(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_movementsSwigExplicitlaban_sequence(swigCPtr, this), true);
  }

  public void add_movement(i_movement i_mov) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_add_movement(swigCPtr, this, i_movement.getCPtr(i_mov), i_mov); else w_e_boneJNI.laban_sequence_add_movementSwigExplicitlaban_sequence(swigCPtr, this, i_movement.getCPtr(i_mov), i_mov);
  }

  public i_mov_vector get_column_movements(int column) {
    return new i_mov_vector((getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_column_movements(swigCPtr, this, column) : w_e_boneJNI.laban_sequence_get_column_movementsSwigExplicitlaban_sequence(swigCPtr, this, column), true);
  }

  public i_movement get_last_movement() {
    long cPtr = (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_get_last_movement(swigCPtr, this) : w_e_boneJNI.laban_sequence_get_last_movementSwigExplicitlaban_sequence(swigCPtr, this);
    return (cPtr == 0) ? null : new i_movement(cPtr, true);
  }

  public void clear_movements() {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_clear_movements(swigCPtr, this); else w_e_boneJNI.laban_sequence_clear_movementsSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public String xml(boolean no_header, long indent, String namesp) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml__SWIG_0(swigCPtr, this, no_header, indent, namesp) : w_e_boneJNI.laban_sequence_xmlSwigExplicitlaban_sequence__SWIG_0(swigCPtr, this, no_header, indent, namesp);
  }

  public String xml(boolean no_header, long indent) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml__SWIG_1(swigCPtr, this, no_header, indent) : w_e_boneJNI.laban_sequence_xmlSwigExplicitlaban_sequence__SWIG_1(swigCPtr, this, no_header, indent);
  }

  public String xml(boolean no_header) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml__SWIG_2(swigCPtr, this, no_header) : w_e_boneJNI.laban_sequence_xmlSwigExplicitlaban_sequence__SWIG_2(swigCPtr, this, no_header);
  }

  public String xml() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml__SWIG_3(swigCPtr, this) : w_e_boneJNI.laban_sequence_xmlSwigExplicitlaban_sequence__SWIG_3(swigCPtr, this);
  }

  public String xml_namespace_header(String namesp) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml_namespace_header__SWIG_0(swigCPtr, this, namesp) : w_e_boneJNI.laban_sequence_xml_namespace_headerSwigExplicitlaban_sequence__SWIG_0(swigCPtr, this, namesp);
  }

  public String xml_namespace_header() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml_namespace_header__SWIG_1(swigCPtr, this) : w_e_boneJNI.laban_sequence_xml_namespace_headerSwigExplicitlaban_sequence__SWIG_1(swigCPtr, this);
  }

  public String xml_schema_location() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml_schema_location(swigCPtr, this) : w_e_boneJNI.laban_sequence_xml_schema_locationSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public String xml_namespace_uri() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_xml_namespace_uri(swigCPtr, this) : w_e_boneJNI.laban_sequence_xml_namespace_uriSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public void xml_file(String path) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_xml_file(swigCPtr, this, path); else w_e_boneJNI.laban_sequence_xml_fileSwigExplicitlaban_sequence(swigCPtr, this, path);
  }

  public String svg(long im_width, long im_height) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_svg(swigCPtr, this, im_width, im_height) : w_e_boneJNI.laban_sequence_svgSwigExplicitlaban_sequence(swigCPtr, this, im_width, im_height);
  }

  public void svg_file(String path, long im_width, long im_height) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_svg_file__SWIG_0(swigCPtr, this, path, im_width, im_height); else w_e_boneJNI.laban_sequence_svg_fileSwigExplicitlaban_sequence__SWIG_0(swigCPtr, this, path, im_width, im_height);
  }

  public void svg_file(String path, long im_width) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_svg_file__SWIG_1(swigCPtr, this, path, im_width); else w_e_boneJNI.laban_sequence_svg_fileSwigExplicitlaban_sequence__SWIG_1(swigCPtr, this, path, im_width);
  }

  public void svg_file(String path) {
    if (getClass() == laban_sequence.class) w_e_boneJNI.laban_sequence_svg_file__SWIG_2(swigCPtr, this, path); else w_e_boneJNI.laban_sequence_svg_fileSwigExplicitlaban_sequence__SWIG_2(swigCPtr, this, path);
  }

  public String str() {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_str(swigCPtr, this) : w_e_boneJNI.laban_sequence_strSwigExplicitlaban_sequence(swigCPtr, this);
  }

  public static long default_beat_duration() {
    return w_e_boneJNI.laban_sequence_default_beat_duration();
  }

  public static long default_beats_per_measure() {
    return w_e_boneJNI.laban_sequence_default_beats_per_measure();
  }

  public static e_time_unit default_time_unit() {
    return e_time_unit.swigToEnum(w_e_boneJNI.laban_sequence_default_time_unit());
  }

  public static int_vector default_columns() {
    return new int_vector(w_e_boneJNI.laban_sequence_default_columns(), true);
  }

  protected String svg_fill_pattern(String pattern_name, long im_width, long im_height) {
    return (getClass() == laban_sequence.class) ? w_e_boneJNI.laban_sequence_svg_fill_pattern(swigCPtr, this, pattern_name, im_width, im_height) : w_e_boneJNI.laban_sequence_svg_fill_patternSwigExplicitlaban_sequence(swigCPtr, this, pattern_name, im_width, im_height);
  }

}
