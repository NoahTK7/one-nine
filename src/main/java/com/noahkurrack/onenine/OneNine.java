/*
 * One Nine, a Minecraft modification
 * Copyright (c) 2016 by Noah Kurrack.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.noahkurrack.onenine;

import com.noahkurrack.onenine.proxy.IProxy;
import com.noahkurrack.onenine.reference.ModRef;
import com.noahkurrack.onenine.util.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

@Mod(modid = ModRef.MOD_MODID, name = ModRef.MOD_NAME, version = ModRef.MOD_VERSION)
public class OneNine {

    @Mod.Instance(ModRef.MOD_MODID)
    public static OneNine instance;

    @SidedProxy(clientSide = ModRef.PROXY_CLIENT, serverSide = ModRef.PROXY_SERVER)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

        LogHelper.info("One Nine Pre-Initialized");

    }

    @EventHandler
     public void init(FMLInitializationEvent event){

        MinecraftForge.EVENT_BUS.register(this);

        LogHelper.info("One Nine Initialized");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("One Nine Post-Initialized");

    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent tick){

        LogHelper.info("Player Tick!");

    }
}
