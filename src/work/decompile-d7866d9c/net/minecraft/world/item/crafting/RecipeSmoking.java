package net.minecraft.world.item.crafting;

import net.minecraft.resources.MinecraftKey;
import net.minecraft.world.item.ItemStack;

public class RecipeSmoking extends RecipeCooking {

    public RecipeSmoking(MinecraftKey minecraftkey, String s, RecipeItemStack recipeitemstack, ItemStack itemstack, float f, int i) {
        super(Recipes.SMOKING, minecraftkey, s, recipeitemstack, itemstack, f, i);
    }

    @Override
    public RecipeSerializer<?> getRecipeSerializer() {
        return RecipeSerializer.r;
    }
}
