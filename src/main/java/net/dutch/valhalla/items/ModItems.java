package net.dutch.valhalla.items;

import net.dutch.valhalla.Valhalla;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // "moonstone" needs to be lower case
    public static final Item MOONSTONE = registerItem("moonstone", new Item(new Item.Settings()));
    public static final Item MOONSTONE_INGOT = registerItem("moonstone_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Valhalla.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Valhalla.LOGGER.info("Registering mod items for " + Valhalla.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MOONSTONE);
            entries.add(MOONSTONE_INGOT);
        });
    }
}
