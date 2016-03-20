package com.noahkurrack.onenine;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.Level;

@Mod(modid = com.noahkurrack.onenine.reference.Mod.MODID, name = com.noahkurrack.onenine.reference.Mod.NAME, version = com.noahkurrack.onenine.reference.Mod.VERSION)
public class OneNine {

    @Mod.Instance("one-nine")
    public static OneNine instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        

    }

    @EventHandler
     public void init(FMLInitializationEvent event){

        MinecraftForge.EVENT_BUS.register(this);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){



    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent tick){

        FMLLog.getLogger().log(Level.INFO, "Hello player tick");

    }
}
