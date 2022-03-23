package toughasnails.handler.compat;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Loader;
import net.msrandom.witchery.WitcheryResurrected;
import net.msrandom.witchery.init.WitcheryCreatureTraits;
import net.msrandom.witchery.init.data.WitcheryAlternateForms;
import net.msrandom.witchery.transformation.CreatureForm;
import net.msrandom.witchery.util.WitcheryUtils;

public class WitcheryTransformations
{
    public static boolean isVampire(EntityPlayer player)
    {
        return Loader.isModLoaded(WitcheryResurrected.MOD_ID) &&
                WitcheryUtils.getExtension(player).isTransformation(WitcheryCreatureTraits.VAMPIRE);
    }

    public static boolean isWerewolf(EntityPlayer player)
    {
        return Loader.isModLoaded(WitcheryResurrected.MOD_ID) &&
                WitcheryUtils.getExtension(player).isTransformation(WitcheryCreatureTraits.WEREWOLF);
    }

    public static boolean isWolfTransformation(EntityPlayer player)
    {
        return isWerewolf(player) &&
                WitcheryUtils.getExtension(player).getCurrentForm() == WitcheryAlternateForms.WOLF;
    }

    public static boolean isWolfmanTransformation(EntityPlayer player)
    {
        return isWerewolf(player) &&
                WitcheryUtils.getExtension(player).getCurrentForm() == WitcheryAlternateForms.WOLFMAN;
    }

    /*public static boolean isTransformation(EntityPlayer player, WitcheryAlternateForms form)
    {
        if (!isVampire(player))
            return false;
        return Loader.isModLoaded(WitcheryResurrected.MOD_ID) &&
                WitcheryUtils.getExtension(player).getCurrentForm().equals(form);

    }*/

}