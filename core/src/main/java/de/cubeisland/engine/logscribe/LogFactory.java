/**
 * The MIT License
 * Copyright (c) 2013 Cube Island
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.cubeisland.engine.logscribe;

/**
 * A Factory to create Log Objects
 */
public interface LogFactory
{
    /**
     * Gets the Logger for given class and id
     *
     * @param clazz the class to get the logger for
     * @param id    the loggers id
     *
     * @return the loggger
     */
    Log getLog(Class<?> clazz, String id);

    /**
     * Gets the Logger for given class and class-name
     *
     * @param clazz the class to get the logger for
     *
     * @return the logger
     */
    Log getLog(Class<?> clazz);

    /**
     * Shuts down all this factory and all its Logger
     */
    void shutdown();

    /**
     * Removes given Log from the internal Map
     * <p>This Method gets called automatically when {@link Log#shutdown()} gets called
     *
     * @param log the logger to remove
     */
    void remove(Log log);
}
