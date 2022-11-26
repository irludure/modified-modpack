package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.ItemGroup;

public class ModItems {

    public static final Item GATORADE = registerItem("gatorade",
        new Item(new FabricItemSettings().group(ModItemGroups.JACK)));

    public static final Item HEART = registerItem("heart",
            new Item(new FabricItemSettings().group(ModItemGroups.JACK)));

    public static final Item REVERB_FRAGMENTS = registerItem("reverb_fragments",
            new Item(new FabricItemSettings().group(ModItemGroups.REVERB)));

    public static final Item BELT = registerItem("belt",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("modid", name), item);
    }
    public static void registerModItems() {
        System.out.println("Registering Mod Items for modid");
    }
}
