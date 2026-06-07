package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.Teal_Dragon;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleWingedDragonModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class Teal_Dragon_Renderer extends AdvancedHumanoidRenderer<Teal_Dragon, Teal_Dragon_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/teal_dragon.png");

    public Teal_Dragon_Renderer(EntityRendererProvider.Context context) {
        super(context, new Teal_Dragon_Model(context.bakeLayer(Teal_Dragon_Model.LAYER_LOCATION)), ArmorLatexMaleWingedDragonModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Teal_Dragon tealDragon) {
        return TEXTURE;
    }
}
