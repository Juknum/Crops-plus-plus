package lokko12.berriespp.crops.natura;

import ic2.api.crops.ICropTile;
import lokko12.berriespp.crops.bpp.BasicBerryCrop;
import ic2.api.crops.CropCard;
import mods.natura.common.NContent;
import net.minecraft.item.ItemStack;

public class MaloberryCrop extends BasicBerryCrop {

    public MaloberryCrop() {
        super();
    }

    public String name() {
        return "Maloberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Edible", "Tendrilly", "Yellow", "Orange"}; // orange like CropCarrots
    }
    
    @Override
	public ItemStack getGain(ICropTile crop) {
		return new ItemStack(NContent.berryItem,3,3);
	}

}
