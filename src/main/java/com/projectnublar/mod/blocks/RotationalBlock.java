package com.projectnublar.mod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class RotationalBlock extends BasicBlock {
	
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
	
	public RotationalBlock(String name, Material material, float hardness, float resistance)
	{
		super(name, material, hardness, resistance);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));
	}
	
	public RotationalBlock(String name, float hardness, float resistance)
	{
		this(name, Material.rock, hardness, resistance);
	}
	
	public RotationalBlock(String name)
	{
		this(name, 2.0f, 10.0f);
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getIndex();
	}
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ,
			int meta, EntityLivingBase placer) {
		//DEBUG System.out.println("Block Placed: " + this.getRegistryName() + ", Property: " + this.getDefaultState().withProperty(FACING,  placer.getHorizontalFacing().getOpposite()).toString());
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
		
	}
	
	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[]{FACING});
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing face = EnumFacing.getFront(meta);
		if (face.getAxis() == EnumFacing.Axis.Y)
		{
			face = EnumFacing.SOUTH;
		}
		return this.getDefaultState().withProperty(FACING, face);
	}
	
	@Override
	public IBlockState getStateForEntityRender(IBlockState state) {
		return this.getDefaultState().withProperty(FACING, EnumFacing.SOUTH);
	}
	
}
