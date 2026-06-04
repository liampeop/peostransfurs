package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.Brown_Mouse;
import com.Peoperer.peostransfurs.entity.custom.Latex_Mylo_Panda;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleCatModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class Latex_Mylo_Panda_Renderer extends AdvancedHumanoidRenderer<Latex_Mylo_Panda, Latex_Mylo_Panda_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/latex_mylo_panda.png");

    public Latex_Mylo_Panda_Renderer(EntityRendererProvider.Context context) {
        super(context, new Latex_Mylo_Panda_Model(context.bakeLayer(Latex_Mylo_Panda_Model.LAYER_LOCATION)), ArmorLatexMaleCatModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Latex_Mylo_Panda tealDragon) {
        return TEXTURE;
    }
}
