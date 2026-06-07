package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.White_Mouse;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleCatModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class White_Mouse_Renderer extends AdvancedHumanoidRenderer<White_Mouse, White_Mouse_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/white_mouse.png");

    public White_Mouse_Renderer(EntityRendererProvider.Context context) {
        super(context, new White_Mouse_Model(context.bakeLayer(White_Mouse_Model.LAYER_LOCATION)), ArmorLatexMaleCatModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(White_Mouse tealDragon) {
        return TEXTURE;
    }
}
