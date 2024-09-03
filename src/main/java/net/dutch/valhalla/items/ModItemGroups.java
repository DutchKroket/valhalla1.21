package net.dutch.valhalla.items;

import net.dutch.valhalla.Valhalla;
import net.dutch.valhalla.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VALHALLA_INGREDIENTS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Valhalla.MOD_ID, "valhalla_ingredients"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MOONSTONE_INGOT))
                    .displayName(Text.translatable("itemgroup.valhalla.valhalla_ingredients_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MOONSTONE);
                        entries.add(ModItems.MOONSTONE_INGOT);
                    }).build());

    public static final ItemGroup VALHALLA_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Valhalla.MOD_ID, "valhalla_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.SKYSTONE))
                    .displayName(Text.translatable("itemgroup.valhalla.valhalla_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SKYSTONE);
                        entries.add(ModBlocks.MOONSTONE_ORE);
                        entries.add(ModBlocks.BLOCK_OF_MOONSTONE);
                    }).build());

    public static void registerItemGroups() {
        Valhalla.LOGGER.info("Registering Item Groups for " + Valhalla.MOD_ID);
    }
}
