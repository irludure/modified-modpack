package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.datafixer.schema.IdentifierNormalizingSchema;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.fabricmc.example.block.ModBlocks;
public class ModItemGroups {
    public static final ItemGroup REVERB = FabricItemGroupBuilder.build(new Identifier("modid", "reverb"),
            () -> new ItemStack(net.fabricmc.example.block.ModBlocks.REVERB_BLOCK));
    public static final ItemGroup JACK = FabricItemGroupBuilder.build(new Identifier("modid", "jack"),
            () -> new ItemStack(ModItems.GATORADE));
}
