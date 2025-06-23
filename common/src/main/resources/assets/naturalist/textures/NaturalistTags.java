package com.starfish_studios.naturalist.core.registry;

import com.starfish_studios.naturalist.Naturalist;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class NaturalistTags {
    public static class BlockTags {
        public static final TagKey<Block> FIREFLIES_SPAWNABLE_ON = tag("fireflies_spawnable_on");
        public static final TagKey<Block> DRAGONFLIES_SPAWNABLE_ON = tag("dragonflies_spawnable_on");
        public static final TagKey<Block> BUTTERFLIES_SPAWNABLE_ON = tag("butterflies_spawnable_on");
        public static final TagKey<Block> VULTURES_SPAWNABLE_ON = tag("vultures_spawnable_on");
        public static final TagKey<Block> DUCKS_SPAWNABLE_ON = tag("ducks_spawnable_on");
        public static final TagKey<Block> RHINO_CHARGE_BREAKABLE = tag("rhino_charge_breakable");
        public static final TagKey<Block> VULTURE_PERCH_BLOCKS = tag("vulture_perch_blocks");
        public static final TagKey<Block> CATTAIL_PLACEABLE = tag("cattail_placeable");
        public static final TagKey<Block> ALLIGATOR_EGG_LAYABLE_ON = tag("alligator_egg_layable_on");
        public static final TagKey<Block> TORTOISE_EGG_LAYABLE_ON = tag("tortoise_egg_layable_on");


        private static TagKey<Block> tag(@NotNull String name) {
            return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class ItemTags {

        public static final TagKey<Item> CRAB_FOOD = tag("crab_food");
        public static final TagKey<Item> MOOSE_FOOD = tag("moose_food");
        public static final TagKey<Item> CAPYBARA_FOOD = tag("capybara_food");
        public static final TagKey<Item> PENGUIN_FOOD = tag("penguin_food");

        public static final TagKey<Item> HYENA_FOOD_ITEMS = tag("hyena_food_items");
        public static final TagKey<Item> OSTRICH_FOOD_ITEMS = tag("ostrich_food_items");

        public static final TagKey<Item> BEAR_TEMPT_ITEMS = tag("bear_tempt_items");
        public static final TagKey<Item> SNAKE_TEMPT_ITEMS = tag("snake_tempt_items");
        public static final TagKey<Item> SNAKE_TAME_ITEMS = tag("snake_tame_items");
        public static final TagKey<Item> BIRD_FOOD_ITEMS = tag("bird_food_items");
        public static final TagKey<Item> GIRAFFE_FOOD_ITEMS = tag("giraffe_food_items");
        public static final TagKey<Item> BOAR_FOOD_ITEMS = tag("boar_food_items");
        public static final TagKey<Item> ALLIGATOR_FOOD_ITEMS = tag("alligator_food_items");
        public static final TagKey<Item> LIZARD_TEMPT_ITEMS = tag("lizard_tempt_items");
        public static final TagKey<Item> TORTOISE_TEMPT_ITEMS = tag("tortoise_tempt_items");
        public static final TagKey<Item> DUCK_FOOD_ITEMS = tag("duck_food_items");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> SAFE_EGG_WALKERS = tag("safe_egg_walkers");
        public static final TagKey<EntityType<?>> OSTRICH_PREDATORS = tag("ostrich_predators");
        public static final TagKey<EntityType<?>> BEAR_HOSTILES = tag("bear_hostiles");
        public static final TagKey<EntityType<?>> SNAKE_HOSTILES = tag("snake_hostiles");
        public static final TagKey<EntityType<?>> DEER_PREDATORS = tag("deer_predators");
        public static final TagKey<EntityType<?>> LION_HOSTILES = tag("lion_hostiles");
        public static final TagKey<EntityType<?>> VULTURE_HOSTILES = tag("vulture_hostiles");
        public static final TagKey<EntityType<?>> CATFISH_HOSTILES = tag("catfish_hostiles");
        public static final TagKey<EntityType<?>> ALLIGATOR_HOSTILES = tag("alligator_hostiles");
        public static final TagKey<EntityType<?>> BOAR_HOSTILES = tag("boar_hostiles");
        public static final TagKey<EntityType<?>> ANIMAL_CRATE_BLACKLISTED = tag("animal_crate_blacklist");

        public static final TagKey<EntityType<?>> NATURALIST_ENTITIES = tag("naturalist_entities");

        private static @NotNull TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(BuiltInRegistries.ENTITY_TYPE.key(), new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> HAS_ALLIGATOR = tag("has_alligator");
        public static final TagKey<Biome> HAS_BASS = tag("has_bass");
        public static final TagKey<Biome> HAS_BEAR = tag("has_bear");
        public static final TagKey<Biome> HAS_BLUEJAY = tag("has_bluejay");
        public static final TagKey<Biome> HAS_BOAR = tag("has_boar");
        public static final TagKey<Biome> HAS_BUTTERFLY = tag("has_butterfly");
        public static final TagKey<Biome> HAS_CANARY = tag("has_canary");
        public static final TagKey<Biome> HAS_CARDINAL = tag("has_cardinal");
        public static final TagKey<Biome> HAS_CATFISH = tag("has_catfish");
        public static final TagKey<Biome> HAS_CORAL_SNAKE = tag("has_coral_snake");
        public static final TagKey<Biome> HAS_DEER = tag("has_deer");
        public static final TagKey<Biome> HAS_DRAGONFLY = tag("has_dragonfly");
        public static final TagKey<Biome> HAS_DUCK = tag("has_duck");
        public static final TagKey<Biome> HAS_ELEPHANT = tag("has_elephant");
        public static final TagKey<Biome> HAS_FINCH = tag("has_finch");
        public static final TagKey<Biome> HAS_FIREFLY = tag("has_firefly");
        public static final TagKey<Biome> HAS_GIRAFFE = tag("has_giraffe");
        public static final TagKey<Biome> HAS_HIPPO = tag("has_hippo");
        public static final TagKey<Biome> HAS_LION = tag("has_lion");
        public static final TagKey<Biome> HAS_LIZARD = tag("has_lizard");
        public static final TagKey<Biome> HAS_RATTLESNAKE = tag("has_rattlesnake");
        public static final TagKey<Biome> HAS_RHINO = tag("has_rhino");
        public static final TagKey<Biome> HAS_ROBIN = tag("has_robin");
        public static final TagKey<Biome> HAS_SNAIL = tag("has_snail");
        public static final TagKey<Biome> HAS_SNAKE = tag("has_snake");
        public static final TagKey<Biome> HAS_SPARROW = tag("has_sparrow");
        public static final TagKey<Biome> HAS_TORTOISE = tag("has_tortoise");
        public static final TagKey<Biome> HAS_VULTURE = tag("has_vulture");
        public static final TagKey<Biome> HAS_ZEBRA = tag("has_zebra");

        public static final TagKey<Biome> BLACKLIST_ALLIGATOR = tag("blacklist/blacklist_alligator");
        public static final TagKey<Biome> BLACKLIST_BASS = tag("blacklist/blacklist_bass");
        public static final TagKey<Biome> BLACKLIST_BEAR = tag("blacklist/blacklist_bear");
        public static final TagKey<Biome> BLACKLIST_BLUEJAY = tag("blacklist/blacklist_bluejay");
        public static final TagKey<Biome> BLACKLIST_BOAR = tag("blacklist/blacklist_boar");
        public static final TagKey<Biome> BLACKLIST_BUTTERFLY = tag("blacklist/blacklist_butterfly");
        public static final TagKey<Biome> BLACKLIST_CANARY = tag("blacklist/blacklist_canary");
        public static final TagKey<Biome> BLACKLIST_CARDINAL = tag("blacklist/blacklist_cardinal");
        public static final TagKey<Biome> BLACKLIST_CATFISH = tag("blacklist/blacklist_catfish");
        public static final TagKey<Biome> BLACKLIST_CORAL_SNAKE = tag("blacklist/blacklist_coral_snake");
        public static final TagKey<Biome> BLACKLIST_DEER = tag("blacklist/blacklist_deer");
        public static final TagKey<Biome> BLACKLIST_DRAGONFLY = tag("blacklist/blacklist_dragonfly");
        public static final TagKey<Biome> BLACKLIST_DUCK = tag("blacklist/blacklist_duck");
        public static final TagKey<Biome> BLACKLIST_ELEPHANT = tag("blacklist/blacklist_elephant");
        public static final TagKey<Biome> BLACKLIST_FINCH = tag("blacklist/blacklist_finch");
        public static final TagKey<Biome> BLACKLIST_FIREFLY = tag("blacklist/blacklist_firefly");
        public static final TagKey<Biome> BLACKLIST_GIRAFFE = tag("blacklist/blacklist_giraffe");
        public static final TagKey<Biome> BLACKLIST_HIPPO = tag("blacklist/blacklist_hippo");
        public static final TagKey<Biome> BLACKLIST_LION = tag("blacklist/blacklist_lion");
        public static final TagKey<Biome> BLACKLIST_LIZARD = tag("blacklist/blacklist_lizard");
        public static final TagKey<Biome> BLACKLIST_RATTLESNAKE = tag("blacklist/blacklist_rattlesnake");
        public static final TagKey<Biome> BLACKLIST_RHINO = tag("blacklist/blacklist_rhino");
        public static final TagKey<Biome> BLACKLIST_ROBIN = tag("blacklist/blacklist_robin");
        public static final TagKey<Biome> BLACKLIST_SNAIL = tag("blacklist/blacklist_snail");
        public static final TagKey<Biome> BLACKLIST_SNAKE = tag("blacklist/blacklist_snake");
        public static final TagKey<Biome> BLACKLIST_SPARROW = tag("blacklist/blacklist_sparrow");
        public static final TagKey<Biome> BLACKLIST_TORTOISE = tag("blacklist/blacklist_tortoise");
        public static final TagKey<Biome> BLACKLIST_VULTURE = tag("blacklist/blacklist_vulture");
        public static final TagKey<Biome> BLACKLIST_ZEBRA = tag("blacklist/blacklist_zebra");



        private static @NotNull TagKey<Biome> tag(String name) {
            return TagKey.create(Registries.BIOME, new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }
}
