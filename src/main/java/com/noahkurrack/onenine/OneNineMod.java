package com.noahkurrack.onenine;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.Level;

@Mod(modid = com.noahkurrack.onenine.OneNineMod.MODID, version = com.noahkurrack.onenine.OneNineMod.VERSION)
public class OneNineMod {
    public static final String MODID = "one-nine";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        MinecraftForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent tick){

        FMLLog.getLogger().log(Level.INFO, "Hello player tick");

    }
}
