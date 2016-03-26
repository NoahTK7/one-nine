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

package com.noahkurrack.onenine.particle;

import com.noahkurrack.onenine.network.PacketHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;

public class Particle {

    public static void spawnClientParticles(EntityPlayer player, EnumParticleTypes type, double offsetX, double offsetY, double offsetZ){

        if (player.worldObj.isRemote) {

            player.worldObj.spawnParticle(type, player.posX, player.posY, player.posZ, offsetX, offsetY, offsetZ, new int[0]);

        }


    }

    public static void spawnServerParticles(){

        //PacketHandler.INSTANCE.sendToAllAround();

    }

}