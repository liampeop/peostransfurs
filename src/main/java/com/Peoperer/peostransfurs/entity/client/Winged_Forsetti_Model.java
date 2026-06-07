package com.Peoperer.peostransfurs.entity.client;

import com.Peoperer.peostransfurs.Peostransfurs;
import com.Peoperer.peostransfurs.entity.Winged_Forsetti;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.ltxprogrammer.changed.client.renderer.animate.AnimatorPresets;
import net.ltxprogrammer.changed.client.renderer.animate.HumanoidAnimator;
import net.ltxprogrammer.changed.client.renderer.model.AdvancedHumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.HumanoidArm;

import java.util.List;

public class Winged_Forsetti_Model extends AdvancedHumanoidModel<Winged_Forsetti> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Peostransfurs.MODID, "winged_forsetti"), "main");
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart Head;
    private final ModelPart Torso;
    private final ModelPart RightWing;
    private final ModelPart LeftWing;
    private final ModelPart Tail;
    private final HumanoidAnimator<Winged_Forsetti, Winged_Forsetti_Model> animator;

    public Winged_Forsetti_Model(ModelPart root) {
        super(root);
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
        this.Head = root.getChild("Head");
        this.Torso = root.getChild("Torso");
        this.RightWing = this.Torso.getChild("RightWing");
        this.LeftWing = this.Torso.getChild("LeftWing");
        this.Tail = this.Torso.getChild("Tail");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");

        ModelPart TailPrimary = this.Tail.getChild("TailPrimary");
        ModelPart TailSecondary = TailPrimary.getChild("TailSecondary");
        ModelPart TailTertiary = TailSecondary.getChild("TailTertiary");

        ModelPart leftLowerLeg = LeftLeg.getChild("LeftLowerLeg");
        ModelPart leftFoot = leftLowerLeg.getChild("LeftFoot");
        ModelPart rightLowerLeg = RightLeg.getChild("RightLowerLeg");
        ModelPart rightFoot = rightLowerLeg.getChild("RightFoot");
        ModelPart leftWingRoot = this.LeftWing.getChild("leftWingRoot");
        ModelPart rightWingRoot = this.RightWing.getChild("rightWingRoot");

        this.animator = HumanoidAnimator.of(this).hipOffset(-1.5F).addPreset(AnimatorPresets.wingedDragonLike(this.Head, this.Torso, this.LeftArm, this.RightArm, this.Tail, List.of(TailPrimary, TailSecondary, TailTertiary), this.LeftLeg, leftLowerLeg, leftFoot, leftFoot.getChild("LeftPad"), this.RightLeg, rightLowerLeg, rightFoot, rightFoot.getChild("RightPad"), leftWingRoot, leftWingRoot.getChild("leftSecondaries"), leftWingRoot.getChild("leftSecondaries").getChild("leftTertiaries"), rightWingRoot, rightWingRoot.getChild("rightSecondaries"), rightWingRoot.getChild("rightSecondaries").getChild("rightTertiaries")));
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-2.5F, 10.5F, 0.0F));

        PartDefinition RightThigh_r1 = RightLeg.addOrReplaceChild("RightThigh_r1", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition RightLowerLeg = RightLeg.addOrReplaceChild("RightLowerLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 6.375F, -3.45F));

        PartDefinition RightCalf_r1 = RightLowerLeg.addOrReplaceChild("RightCalf_r1", CubeListBuilder.create().texOffs(40, 40).addBox(-1.99F, -0.125F, -2.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.125F, 1.95F, 0.8727F, 0.0F, 0.0F));

        PartDefinition RightFoot = RightLowerLeg.addOrReplaceChild("RightFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8F, 7.175F));

        PartDefinition RightArch_r1 = RightFoot.addOrReplaceChild("RightArch_r1", CubeListBuilder.create().texOffs(32, 50).addBox(-2.0F, -8.45F, -0.725F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.075F, -4.975F, -0.3491F, 0.0F, 0.0F));

        PartDefinition RightPad = RightFoot.addOrReplaceChild("RightPad", CubeListBuilder.create().texOffs(44, 21).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.325F, -4.425F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(2.5F, 10.5F, 0.0F));

        PartDefinition LeftThigh_r1 = LeftLeg.addOrReplaceChild("LeftThigh_r1", CubeListBuilder.create().texOffs(40, 29).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

        PartDefinition LeftLowerLeg = LeftLeg.addOrReplaceChild("LeftLowerLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 6.375F, -3.45F));

        PartDefinition LeftCalf_r1 = LeftLowerLeg.addOrReplaceChild("LeftCalf_r1", CubeListBuilder.create().texOffs(44, 11).addBox(-2.01F, -0.125F, -2.9F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.125F, 1.95F, 0.8727F, 0.0F, 0.0F));

        PartDefinition LeftFoot = LeftLowerLeg.addOrReplaceChild("LeftFoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.8F, 7.175F));

        PartDefinition LeftArch_r1 = LeftFoot.addOrReplaceChild("LeftArch_r1", CubeListBuilder.create().texOffs(46, 50).addBox(-2.0F, -8.45F, -0.725F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 7.075F, -4.975F, -0.3491F, 0.0F, 0.0F));

        PartDefinition LeftPad = LeftFoot.addOrReplaceChild("LeftPad", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, 0.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.325F, -4.425F));

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(32, 11).addBox(-2.0F, -3.0F, -6.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(32, 47).addBox(-1.5F, -1.0F, -5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 0.0F));

        PartDefinition RightEar = Head.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.7F, -6.05F, -1.0F, -0.2618F, 0.0873F, -0.3054F));

        PartDefinition RightEarPivot = RightEar.addOrReplaceChild("RightEarPivot", CubeListBuilder.create().texOffs(16, 54).addBox(-2.9F, -3.2F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 37).addBox(-2.3F, -1.85F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.04F))
                .texOffs(16, 42).addBox(-1.9F, -4.2F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 54).addBox(-0.9F, -5.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 7).addBox(-1.3F, -3.85F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(0.5F, -1.25F, 0.0F, -0.1309F, 0.5236F, -0.3491F));

        PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -6.05F, -1.0F, -0.2618F, -0.0873F, 0.3054F));

        PartDefinition LeftEarPivot = LeftEar.addOrReplaceChild("LeftEarPivot", CubeListBuilder.create().texOffs(0, 56).addBox(-1.1F, -3.2F, -1.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 32).addBox(-0.7F, -1.85F, -0.3F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.04F))
                .texOffs(32, 45).addBox(-1.1F, -4.2F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 56).addBox(-1.1F, -5.2F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 7).addBox(-0.7F, -3.85F, -0.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.04F)), PartPose.offsetAndRotation(-0.5F, -1.25F, 0.0F, -0.1309F, -0.5236F, 0.3491F));

        PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 0.0F));

        PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 10.5F, 0.0F));

        PartDefinition TailPrimary = Tail.addOrReplaceChild("TailPrimary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

        PartDefinition Base_r1 = TailPrimary.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(16, 45).addBox(-2.0F, 0.75F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1781F, 0.0F, 0.0F));

        PartDefinition TailSecondary = TailPrimary.addOrReplaceChild("TailSecondary", CubeListBuilder.create(), PartPose.offset(0.0F, 1.25F, 4.5F));

        PartDefinition Base_r2 = TailSecondary.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(24, 16).addBox(-2.5F, -0.45F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 1.4835F, 0.0F, 0.0F));

        PartDefinition TailTertiary = TailSecondary.addOrReplaceChild("TailTertiary", CubeListBuilder.create(), PartPose.offset(0.0F, 0.75F, 6.5F));

        PartDefinition Base_r3 = TailTertiary.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(0, 48).addBox(-2.0F, -0.7F, -1.95F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 1.8326F, 0.0F, 0.0F));

        PartDefinition RightWing = Torso.addOrReplaceChild("RightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 3.0F, 2.0F, 0.0F, 0.48F, 0.0F));

        PartDefinition rightWingRoot = RightWing.addOrReplaceChild("rightWingRoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Feather_r1 = rightWingRoot.addOrReplaceChild("Feather_r1", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -1.0F, 0.0F, 0.0436F, 0.0F, 0.3491F));

        PartDefinition Feather_r2 = rightWingRoot.addOrReplaceChild("Feather_r2", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -2.0F, 0.0F, 0.0F, -0.0436F, 0.2618F));

        PartDefinition Feather_r3 = rightWingRoot.addOrReplaceChild("Feather_r3", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r1 = rightWingRoot.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-25.075F, -12.7F, 1.2F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 20.0F, -2.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r2 = rightWingRoot.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(116, 7).addBox(-12.775F, -19.75F, 1.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(2.0F, 20.0F, -2.0F, 0.0F, 0.0F, 0.3491F));

        PartDefinition rightSecondaries = rightWingRoot.addOrReplaceChild("rightSecondaries", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.3F, -7.0F, -0.5F, 0.0F, 0.0F, 0.5236F));

        PartDefinition Feather_r4 = rightSecondaries.addOrReplaceChild("Feather_r4", CubeListBuilder.create().texOffs(116, 10).addBox(-2.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.05F, 1.1F, 0.25F, -0.0456F, -0.1299F, -0.0684F));

        PartDefinition Feather_r5 = rightSecondaries.addOrReplaceChild("Feather_r5", CubeListBuilder.create().texOffs(116, 10).addBox(-2.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.1F, 0.25F, -0.0456F, -0.1299F, -0.0684F));

        PartDefinition Feather_r6 = rightSecondaries.addOrReplaceChild("Feather_r6", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 2.5F, 0.5F, -0.0983F, -0.3073F, 0.0453F));

        PartDefinition Feather_r7 = rightSecondaries.addOrReplaceChild("Feather_r7", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.8F, 3.0F, 0.5F, 0.0426F, -0.0094F, -0.262F));

        PartDefinition rightTertiaries = rightSecondaries.addOrReplaceChild("rightTertiaries", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));

        PartDefinition Feather_r8 = rightTertiaries.addOrReplaceChild("Feather_r8", CubeListBuilder.create().texOffs(116, 10).addBox(-2.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.4F, 0.25F, -0.0431F, 0.1791F, -1.0826F));

        PartDefinition Feather_r9 = rightTertiaries.addOrReplaceChild("Feather_r9", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 5.5F, 0.5F, 0.1328F, -0.3827F, -0.6993F));

        PartDefinition Feather_r10 = rightTertiaries.addOrReplaceChild("Feather_r10", CubeListBuilder.create().texOffs(116, 10).addBox(-2.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.25F, 0.0012F, -0.0388F, -1.0808F));

        PartDefinition Feather_r11 = rightTertiaries.addOrReplaceChild("Feather_r11", CubeListBuilder.create().texOffs(116, 10).addBox(-2.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5F, 0.25F, 0.0542F, 0.0375F, -0.8588F));

        PartDefinition Feather_r12 = rightTertiaries.addOrReplaceChild("Feather_r12", CubeListBuilder.create().texOffs(122, 10).addBox(-2.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 2.5F, 0.5F, 0.1288F, -0.2961F, -0.6873F));

        PartDefinition cube_r3 = rightTertiaries.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 64).addBox(2.3F, -22.5F, 1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 27.0F, -1.5F, 0.0F, 0.0F, -0.5236F));

        PartDefinition cube_r4 = rightTertiaries.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(106, 65).addBox(-10.15F, -27.2F, 1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(9.0F, 27.0F, -1.5F, 0.0F, 0.0F, 0.0436F));

        PartDefinition LeftWing = Torso.addOrReplaceChild("LeftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 3.0F, 2.0F, 0.0F, -0.48F, 0.0F));

        PartDefinition leftWingRoot = LeftWing.addOrReplaceChild("leftWingRoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Feather_r13 = leftWingRoot.addOrReplaceChild("Feather_r13", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition Feather_r14 = leftWingRoot.addOrReplaceChild("Feather_r14", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(5.5F, -2.0F, 0.0F, 0.0F, 0.0436F, -0.2618F));

        PartDefinition cube_r5 = leftWingRoot.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.0436F, 0.0F, -0.3491F));

        PartDefinition cube_r6 = leftWingRoot.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(89, 0).addBox(19.075F, -12.7F, 1.2F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 20.0F, -2.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r7 = leftWingRoot.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(115, 59).addBox(7.775F, -19.75F, 1.2F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-2.0F, 20.0F, -2.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition leftSecondaries = leftWingRoot.addOrReplaceChild("leftSecondaries", CubeListBuilder.create(), PartPose.offsetAndRotation(7.3F, -7.0F, -0.5F, 0.0F, 0.0F, -0.5236F));

        PartDefinition Feather_r15 = leftSecondaries.addOrReplaceChild("Feather_r15", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.1F, 0.25F, -0.0456F, 0.1299F, 0.0684F));

        PartDefinition Feather_r16 = leftSecondaries.addOrReplaceChild("Feather_r16", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.05F, 1.1F, 0.25F, -0.0456F, 0.1299F, 0.0684F));

        PartDefinition Feather_r17 = leftSecondaries.addOrReplaceChild("Feather_r17", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.8F, 3.0F, 0.5F, 0.0426F, 0.0094F, 0.262F));

        PartDefinition Feather_r18 = leftSecondaries.addOrReplaceChild("Feather_r18", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.3F, 2.5F, 0.5F, -0.0983F, 0.3073F, -0.0453F));

        PartDefinition leftTertiaries = leftSecondaries.addOrReplaceChild("leftTertiaries", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition Feather_r19 = leftTertiaries.addOrReplaceChild("Feather_r19", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, 0.25F, 0.0542F, -0.0375F, 0.8588F));

        PartDefinition Feather_r20 = leftTertiaries.addOrReplaceChild("Feather_r20", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.5F, 0.25F, 0.0012F, 0.0388F, 1.0808F));

        PartDefinition Feather_r21 = leftTertiaries.addOrReplaceChild("Feather_r21", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 2.5F, 0.5F, 0.1288F, 0.2961F, 0.6873F));

        PartDefinition Feather_r22 = leftTertiaries.addOrReplaceChild("Feather_r22", CubeListBuilder.create().texOffs(116, 10).mirror().addBox(-1.0F, 1.0F, 0.0F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.4F, 0.25F, -0.0431F, -0.1791F, 1.0826F));

        PartDefinition Feather_r23 = leftTertiaries.addOrReplaceChild("Feather_r23", CubeListBuilder.create().texOffs(122, 10).mirror().addBox(-1.0F, -2.0F, 0.0F, 3.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 5.5F, 0.5F, 0.1328F, 0.3827F, 0.6993F));

        PartDefinition cube_r8 = leftTertiaries.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 64).addBox(-3.3F, -22.5F, 1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 27.0F, -1.5F, 0.0F, 0.0F, 0.5236F));

        PartDefinition cube_r9 = leftTertiaries.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(98, 65).addBox(9.15F, -27.2F, 1.2F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-9.0F, 27.0F, -1.5F, 0.0F, 0.0F, -0.0436F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 1.5F, 0.0F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 29).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 1.5F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public ModelPart getArm(HumanoidArm side) {
        return side == HumanoidArm.LEFT ? this.LeftArm : this.RightArm;
    }

    @Override
    public ModelPart getLeg(HumanoidArm side) {
        return side == HumanoidArm.LEFT ? this.LeftLeg : this.RightLeg;
    }

    @Override
    public ModelPart getHead() {
        return this.Head;
    }

    @Override
    public ModelPart getTorso() {
        return this.Torso;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public HumanoidAnimator<Winged_Forsetti, ?> getAnimator(Winged_Forsetti whiteMouse) {
        return this.animator;
    }
}
