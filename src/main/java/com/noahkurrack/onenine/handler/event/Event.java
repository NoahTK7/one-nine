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

package com.noahkurrack.onenine.handler.event;

import com.noahkurrack.onenine.OneNine;
import com.noahkurrack.onenine.proxy.ClientProxy;
import com.noahkurrack.onenine.util.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class Event {

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent tick){

        //LogHelper.info("Player Tick!");

    }

    @SubscribeEvent
    public void onItemCrafted(PlayerEvent.ItemCraftedEvent event){

        LogHelper.info("Item Crafted");

        OneNine.proxy.spawnClientParticles(event.player, EnumParticleTypes.FIREWORKS_SPARK, 0D, 0D, 0D);

    }

}
