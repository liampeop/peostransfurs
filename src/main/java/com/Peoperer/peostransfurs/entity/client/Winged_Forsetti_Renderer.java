package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.Winged_Forsetti;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleCatModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class Winged_Forsetti_Renderer extends AdvancedHumanoidRenderer<Winged_Forsetti, Winged_Forsetti_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/winged_forsetti.png");

    public Winged_Forsetti_Renderer(EntityRendererProvider.Context context) {
        super(context, new Winged_Forsetti_Model(context.bakeLayer(Winged_Forsetti_Model.LAYER_LOCATION)), ArmorLatexMaleCatModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Winged_Forsetti tealDragon) {
        return TEXTURE;
    }
}
