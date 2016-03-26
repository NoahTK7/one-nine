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

package com.noahkurrack.onenine.network;

import com.noahkurrack.onenine.OneNine;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageSingleParticleEvent implements IMessage, IMessageHandler<MessageSingleParticleEvent, IMessage> {

    private String particleName;
    private double xCoord, yCoord, zCoord;
    private double xVelocity, yVelocity, zVelocity;

    public MessageSingleParticleEvent(){

    }

    public MessageSingleParticleEvent(String particleName, double xCoord, double yCoord, double zCoord, double xVelocity, double yVelocity, double zVelocity){

        this.particleName = particleName;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.zVelocity = zVelocity;

    }

    @Override
    public void fromBytes(ByteBuf buf) {

        int particleNameLength = buf.readInt();
        this.particleName = new String(buf.readBytes(particleNameLength).array());
        this.xCoord = buf.readDouble();
        this.yCoord = buf.readDouble();
        this.zCoord = buf.readDouble();
        this.xVelocity = buf.readDouble();
        this.yVelocity = buf.readDouble();
        this.zVelocity = buf.readDouble();

    }

    @Override
    public void toBytes(ByteBuf buf) {

        buf.writeInt(particleName.length());
        buf.writeBytes(particleName.getBytes());
        buf.writeDouble(xCoord);
        buf.writeDouble(yCoord);
        buf.writeDouble(zCoord);
        buf.writeDouble(xVelocity);
        buf.writeDouble(yVelocity);
        buf.writeDouble(zVelocity);

    }

    @Override
    public IMessage onMessage(MessageSingleParticleEvent message, MessageContext ctx) {

        OneNine.proxy.spawnServerParticles(message.particleName, FMLClientHandler.instance().getWorldClient().provider.getDimension(), message.xCoord, message.yCoord, message.zCoord, message.xVelocity, message.yVelocity, message.zVelocity);
        return null;

    }
}
