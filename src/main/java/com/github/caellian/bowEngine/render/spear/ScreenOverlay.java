/*
 * BowEngine, modular and easy to use game engine
 * Copyright (C) 2015 Caellian
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.caellian.bowEngine.render.spear;

import com.github.caellian.bowEngine.render.IScreenDrawable;

/**
 * @author Caellian
 */
public class ScreenOverlay implements IScreenDrawable
{
	@Override
	public boolean draw()
	{
		return false;
	}

	@Override
	public int getSizeX()
	{
		return 0;
	}

	@Override
	public int getSizeY()
	{
		return 0;
	}
}
