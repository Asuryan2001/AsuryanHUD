package net.asuryan.asuryan_hud.item;

import net.asuryan.asuryan_hud.AsuryanHUD;
import net.asuryan.asuryan_hud.item.custom.MetaldetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AsuryanHUD.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetaldetectorItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
