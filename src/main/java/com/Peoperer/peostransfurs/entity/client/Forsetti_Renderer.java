package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.Brown_Mouse;
import com.Peoperer.peostransfurs.entity.custom.Forsetti;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleCatModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class Forsetti_Renderer extends AdvancedHumanoidRenderer<Forsetti, Forsetti_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/forsetti.png");

    public Forsetti_Renderer(EntityRendererProvider.Context context) {
        super(context, new Forsetti_Model(context.bakeLayer(Forsetti_Model.LAYER_LOCATION)), ArmorLatexMaleCatModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Forsetti tealDragon) {
        return TEXTURE;
    }
}
