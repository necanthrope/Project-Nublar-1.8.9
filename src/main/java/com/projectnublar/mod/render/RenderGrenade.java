package com.projectnublar.mod.render;

import com.projectnublar.mod.entity.EntityFragGrenade;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SuppressWarnings("deprecation")
@SideOnly(Side.CLIENT)
public class RenderGrenade extends Render<EntityFragGrenade> {
	
    private RenderItem renderItem;
    private Item item;

    public RenderGrenade(Item par2) {
    	super(Minecraft.getMinecraft().getRenderManager());
        this.renderItem = Minecraft.getMinecraft().getRenderItem();
        this.item = par2;
    }

    @Override
    public void doRender(EntityFragGrenade par1Entity, double par2, double par4, double par6, float par8, float par9) {
    	GlStateManager.pushMatrix();
        GlStateManager.translate((float)par2, (float)par4, (float)par6);
        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(0.5F, 0.5F, 0.5F);
        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
        this.bindTexture(TextureMap.locationBlocksTexture);
        this.renderItem.renderItem(this.getItem(par1Entity), ItemCameraTransforms.TransformType.GROUND);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
    
    public ItemStack getItem(Entity e) {
        return new ItemStack(this.item, 1, 0);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFragGrenade par1Entity) {
        return TextureMap.locationBlocksTexture;
    }
}
