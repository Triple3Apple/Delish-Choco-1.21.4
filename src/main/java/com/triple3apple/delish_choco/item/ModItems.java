package com.triple3apple.delish_choco.item;

import com.triple3apple.delish_choco.DelishChoco;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    // A DeferredRegister is basically a long list of all the items you want to register, their attributes/properties and when the time comes (deferred)
    // we'll tell minecraft that we have some more items to add.
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DelishChoco.MOD_ID);

    public static final DeferredItem<Item> CHOCOLATE_BRICKS = ITEMS.register("chocolate_bricks",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(DelishChoco.MOD_ID, "chocolate_bricks")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
