/*
 * This file is part of Backpack.
 *
 * Copyright (c) 2012, AlmuraDev <http://www.almuramc.com/>
 * Backpack is licensed under the GNU Public License version 3.
 *
 * Backpack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Backpack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Backpack.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.almuramc.backpack.bukkit.util;

/**
 * Simple class to add math utility methods
 */
public class MathUtil {
	public static boolean isValidBackpackSize(int size) {
		if (size > 54 || size < 9 || size % 9 != 0) {
			return false;
		}

		return true;
	}
}