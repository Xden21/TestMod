package com.xden21.testmod;

import com.xden21.testmod.handler.ConfigurationHandler;
import com.xden21.testmod.proxy.IProxy;
import com.xden21.testmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TestMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TestMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent e)
    {
        ConfigurationHandler.Init(e.getSuggestedConfigurationFile());
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

