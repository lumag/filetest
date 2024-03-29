/*
 * FileTest - JUnit file-based testing addon
 * Copyright (C) 2006 Dmitry Baryshkov
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *   
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *   
 *   You should have received a copy of the GNU General Public License
 *   along with this program; if not, write to the Free Software
 *   Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package org.lumag.filetest;

import java.io.File;

/**
 * This interface specifies file-based testing configuration.
 * You will provide an object implementing this interface for most
 * testing routines.
 */
public interface ITestConfig {

	/**
	 * Returns a <code>File</code> representing a directory holding all expected result files.
	 * @return a <code>File</code> representing a directory holding all expected result files.
	 */
	public abstract File getExpectedDir();

	/**
	 * Returns a <code>File</code> representing a directory holding all test files.
	 * @return a <code>File</code> representing a directory holding all test files.
	 */
	public abstract File getTestsDir();

	/**
	 * Returns a <code>File</code> representing a directory holding all temporary files.
	 * @return a <code>File</code> representing a directory holding all temporary files.
	 */
	public abstract File getTempDir();

}
