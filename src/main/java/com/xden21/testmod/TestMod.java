package com.xden21.testmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "TestMod", name = "Test Mod", version = "1.7.10-1.0")
public class TestMod
{
    @Mod.Instance("TestMod")
    public static TestMod instance;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent e)
    {

    }
}

