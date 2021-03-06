package org.sonatype.flexmojos.plugin.compiler.attributes;

import org.sonatype.flexmojos.compiler.IDefaultScriptLimits;

public class MavenDefaultScriptLimits
    implements IDefaultScriptLimits
{

    private String maxExecutionTime;

    private String maxRecursionDepth;

    public String maxExecutionTime()
    {
        return maxExecutionTime;
    }

    public String maxRecursionDepth()
    {
        return maxRecursionDepth;
    }

}
