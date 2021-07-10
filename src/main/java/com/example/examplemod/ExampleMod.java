package com.example.examplemod;

import org.apache.logging.log4j.Logger;

import mchorse.metamorph.Metamorph;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.MODNAME, version = ExampleMod.VERSION, dependencies = ExampleMod.DEPENDENCIES)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String MODNAME = "Example Mod";
    public static final String VERSION = "%VERSION%";
    public static final String DEPENDENCIES = "required-after:metamorph";
    
    public static Logger LOGGER = null;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	LOGGER = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Some example code
    	LOGGER.debug("Metamorph.MODNAME = '" + Metamorph.MODNAME + "'");
    }
}
