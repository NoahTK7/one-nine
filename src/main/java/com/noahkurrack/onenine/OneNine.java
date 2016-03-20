package com.noahkurrack.onenine;

import com.noahkurrack.onenine.proxy.IProxy;
import com.noahkurrack.onenine.reference.ModRef;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.Level;

@Mod(modid = ModRef.MOD_MODID, name = ModRef.MOD_NAME, version = ModRef.MOD_VERSION)
public class OneNine {

    @Mod.Instance("one-nine")
    public static OneNine instance;

    @SidedProxy(clientSide = ModRef.PROXY_CLIENT, serverSide = ModRef.PROXY_SERVER)
    public static IProxy proxy;

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
