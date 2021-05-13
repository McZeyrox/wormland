// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports


public class custom_model extends EntityModel<Entity> {
	private final ModelRenderer worm_king;
	private final ModelRenderer tail;
	private final ModelRenderer tail_2_r1;
	private final ModelRenderer boddy;
	private final ModelRenderer boddy_1_r1;
	private final ModelRenderer head;

	public custom_model() {
		textureWidth = 32;
		textureHeight = 32;

		worm_king = new ModelRenderer(this);
		worm_king.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		worm_king.addChild(tail);
		tail.setTextureOffset(6, 11).addBox(1.0F, -2.0F, 0.0F, -2.0F, 2.0F, 5.0F, 0.0F, false);

		tail_2_r1 = new ModelRenderer(this);
		tail_2_r1.setRotationPoint(0.0F, -1.0F, 1.0F);
		tail.addChild(tail_2_r1);
		setRotationAngle(tail_2_r1, -1.0908F, 0.0F, 0.0F);
		tail_2_r1.setTextureOffset(0, 11).addBox(1.5F, -1.1073F, -5.2544F, -3.0F, 2.0F, 6.0F, 0.0F, false);

		boddy = new ModelRenderer(this);
		boddy.setRotationPoint(0.0F, -1.0F, 1.0F);
		worm_king.addChild(boddy);
		

		boddy_1_r1 = new ModelRenderer(this);
		boddy_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		boddy.addChild(boddy_1_r1);
		setRotationAngle(boddy_1_r1, -0.9599F, 0.0F, 0.0F);
		boddy_1_r1.setTextureOffset(12, 0).addBox(2.5F, -2.1073F, -10.2544F, -5.0F, 4.0F, 7.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		worm_king.addChild(head);
		head.setTextureOffset(0, 19).addBox(2.0F, -11.0F, -9.5F, -3.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, -12.0F, -8.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(4, 27).addBox(-1.0F, -13.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 27).addBox(1.0F, -13.0F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 21).addBox(-1.0F, -13.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 19).addBox(1.0F, -13.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		worm_king.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}