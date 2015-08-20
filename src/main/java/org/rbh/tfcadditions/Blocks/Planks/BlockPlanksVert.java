package org.rbh.tfcadditions.Blocks.Planks;

import com.bioxx.tfc.Core.TFCTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Blocks.BlockPlanks;

/**
 * Created by rbh on 20.08.2015.
 */
public class BlockPlanksVert extends BlockPlanks {
    public BlockPlanksVert() {
        super(Material.wood, " Plank Vertical");
        this.setCreativeTab(TFCTabs.TFCBuilding);
        names = getMetaNames(NameType.FIRST_BRACKET);
        icons = new IIcon[names.length];
    }
}
