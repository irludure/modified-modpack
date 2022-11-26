package net.fabricmc.example.block;


import net.fabricmc.example.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private static int reverbBlockLuminance = 28;
    private static  int reverbOreLuminance = 8;
    public static final Block REVERB_BLOCK = registerBlock("reverb_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.3f).luminance(reverbBlockLuminance).requiresTool().mapColor(DyeColor.CYAN)), ModItemGroups.REVERB);
    public static final Block REVERB_ORE = registerBlock("reverb_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.3f).luminance(reverbOreLuminance).requiresTool().mapColor(DyeColor.CYAN)), ModItemGroups.REVERB);


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier("modid", name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier("modid", name), block);

    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for modid");
    }
}
