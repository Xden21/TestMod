package com.xden21.testmod.handler;

import com.xden21.testmod.utility.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void Init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean configTest = false;

        try
        {
            configuration.load();
            configTest = configuration.get(Configuration.CATEGORY_GENERAL, "configTest", true, "this is a test it won't do a thing!").getBoolean(true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            configuration.save();
        }
        LogHelper.info(configTest);

    }
}
