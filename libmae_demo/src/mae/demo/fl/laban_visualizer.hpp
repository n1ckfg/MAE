/*
 * laban_visualizer.hpp
 *
 *  Created on: 20.09.2014
 *      Author: furylynx
 */

#ifndef LABAN_VISUALIZER_HPP_
#define LABAN_VISUALIZER_HPP_

//custom includes
#include "res/res.hpp"

//global includes
#include <memory>
#include <vector>

#include <SDL2/SDL.h>
#include <SDL2/SDL_image.h>

#include <librsvg/rsvg.h>

#include <mae/mae.hpp>


namespace mae
{
	namespace demo
	{
		namespace fl
		{

			class laban_visualizer
			{
				public:
					/**
					 * Creates a new visualizer for laban sequences.
					 *
					 * @param format The pixel format to be applied.
					 * @param use_svg_renderer True to use SVG rendering instead of scaled bitmaps (which do not support anything apart from direction symbols).
					 * @param use_nano_svg_renderer True to use nanosvg renderer, false for rsvg.
					 */
					laban_visualizer(SDL_PixelFormat* format, bool use_svg_renderer = true, bool use_nano_svg_renderer = false);

					/**
					 * Creates a new visualizer for laban sequences with a default pixel format.
					 *
					 * @param use_svg_renderer True to use SVG rendering instead of scaled bitmaps (which do not support anything apart from direction symbols).
					 * @param use_nano_svg_renderer True to use nanosvg renderer, false for rsvg.
					 */
					laban_visualizer(bool use_svg_renderer = true, bool use_nano_svg_renderer = false);

					virtual ~laban_visualizer();

					/**
					 * Paints the sequence to the graphics surface by rendering the SVG sequence.
					 *
					 * @param graphics The surface to be drawn on.
					 * @param sequence The sequence to be drawn.
					 * @param window_width The window's width.
					 * @param window_height The window's height.
					 */
					virtual void paint_sequence(SDL_Surface* graphics, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int window_width, int window_height) const;


					/**
					 * Paints the sequence to the graphics surface using raw SDL operations.
					 *
					 * @param graphics The surface to be drawn on.
					 * @param sequence The sequence to be drawn.
					 * @param window_width The window's width.
					 * @param window_height The window's height.
					 */
					virtual void paint_sequence_raw(SDL_Surface* graphics, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int window_width, int window_height) const;


					/**
                     * Prints the sequence to the bitmap file.
                     *
                     * @param file The file to be printed to.
                     * @param sequence The sequence to be printed.
                     * @param window_width The image width.
                     * @param window_height The image height.
                     */
                    virtual void bmp(std::string file, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int width = 1920, int height = 1080) const;

                    /**
                     * Prints the sequence to the png file.
                     *
                     * @param file The file to be printed to.
                     * @param sequence The sequence to be printed.
                     * @param window_width The image width.
                     * @param window_height The image height.
                     */
                    virtual void png(std::string file, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int width = 1920, int height = 1080) const;


                    /**
                     * Prints the sequence to the jpeg file.
                     *
                     * @param file The file to be printed to.
                     * @param sequence The sequence to be printed.
                     * @param window_width The image width.
                     * @param window_height The image height.
                     */
                    virtual void jpeg(std::string file, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int width = 1920, int height = 1080) const;

				private:
					std::shared_ptr<res::directions_handler> directions_handler_;
					SDL_PixelFormat* format_;
                    bool use_svg_renderer_;
                    bool use_nano_svg_renderer_;

					bool free_format_;


					/**
					 * Draws the staff on the graphics.
					 *
					 * @param graphics The graphics component.
					 * @param sequence The sequence.
					 * @param window_width The window width.
					 * @param window_height The window height.
					 * @param max_column_index The maximum column index.
					 */
					virtual void paint_staff(SDL_Surface* graphics, std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int window_width, int window_height, int max_column_index) const;

					/**
					 * Draws the line on the graphics.
					 *
					 * @param graphics The graphics component.
					 * @param from_x x1.
					 * @param from_y y1.
					 * @param to_x x2.
					 * @param to_y y2.
					 */
					virtual void draw_line(SDL_Surface* graphics, int from_x, int from_y, int to_x, int to_y) const;

					virtual SDL_Surface* prepare_surface(std::shared_ptr<mae::fl::laban::laban_sequence> sequence, int width = 1920, int height = 1080) const;
			};

		} // namespace fl
	} // namespace demo
} // namespace mae

#endif // LABAN_VISUALIZER_HPP_
