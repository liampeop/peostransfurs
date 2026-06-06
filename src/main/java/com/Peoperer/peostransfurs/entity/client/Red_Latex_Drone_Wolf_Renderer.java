package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.custom.Latex_Drone_Wolf;
import com.Peoperer.peostransfurs.entity.custom.Red_Latex_Drone_Wolf;
import net.ltxprogrammer.changed.client.renderer.AdvancedHumanoidRenderer;
import net.ltxprogrammer.changed.client.renderer.layers.CustomEyesLayer;
import net.ltxprogrammer.changed.client.renderer.layers.GasMaskLayer;
import net.ltxprogrammer.changed.client.renderer.layers.TransfurCapeLayer;
import net.ltxprogrammer.changed.client.renderer.model.armor.ArmorLatexMaleWolfModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class Red_Latex_Drone_Wolf_Renderer extends AdvancedHumanoidRenderer<Red_Latex_Drone_Wolf, Red_Latex_Drone_Wolf_Model> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Peostransfurs.MODID, "textures/red_latex_drone_wolf.png");

    public Red_Latex_Drone_Wolf_Renderer(EntityRendererProvider.Context context) {
        super(context, new Red_Latex_Drone_Wolf_Model(context.bakeLayer(Red_Latex_Drone_Wolf_Model.LAYER_LOCATION)), ArmorLatexMaleWolfModel.MODEL_SET, 0.5f);
        this.addLayer(TransfurCapeLayer.normalCape(this, context.getModelSet()));
        this.addLayer(new CustomEyesLayer(this, context.getModelSet()));
        this.addLayer(GasMaskLayer.forSnouted(this, context.getModelSet()));
    }

    @Override
    public ResourceLocation getTextureLocation(Red_Latex_Drone_Wolf tealDragon) {
        return TEXTURE;
    }
}
