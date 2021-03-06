package org.cubeengine.logscribe.target;

import org.cubeengine.logscribe.LoggingException;

public class LogTargetException extends LoggingException
{
    public LogTargetException(String message)
    {
        super(message);
    }

    public LogTargetException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public LogTargetException(Throwable cause)
    {
        super(cause);
    }
}
