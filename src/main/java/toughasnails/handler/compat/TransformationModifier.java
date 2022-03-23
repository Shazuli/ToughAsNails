package toughasnails.handler.compat;

import net.minecraft.entity.player.EntityPlayer;
import net.msrandom.witchery.init.data.WitcheryAlternateForms;
import toughasnails.api.temperature.IModifierMonitor;
import toughasnails.api.temperature.Temperature;
import toughasnails.temperature.modifier.TemperatureModifier;

public class TransformationModifier extends TemperatureModifier
{
    public TransformationModifier(String id)
    {
        super(id);


    }

    @Override
    public Temperature applyPlayerModifiers(EntityPlayer player, Temperature initialTemperature, IModifierMonitor monitor)
    {
        int newTemperatureLevel = initialTemperature.getRawValue();
        //return super.applyPlayerModifiers(player, initialTemperature, monitor);

        if (WitcheryTransformations.isWolfTransformation(player) || WitcheryTransformations.isWolfmanTransformation(player)) {
            newTemperatureLevel += 2;
        }


        return new Temperature(newTemperatureLevel);
    }

    @Override
    public boolean isPlayerSpecific()
    {
        return true;
    }
}
