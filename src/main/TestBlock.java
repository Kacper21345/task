package main;

import main.interfaces.Block;
import main.interfaces.CompositeBlock;

import java.util.List;

public class TestBlock implements CompositeBlock {

    private String color;
    private String material;
    private List<Block> blocks;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}
