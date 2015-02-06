package jasy.lang.ast;

import jasy.lang.ASMCompiler;
import jasy.lang.ASMCompiler.Region;

public abstract class AbstractAST implements AST {
    private Region region;

    protected AbstractAST(Region region) {
        this.region = region;
    }
    
    @Override
    public ASMCompiler.Region getRegion() {
        return region;
    }

    @Override
    public void setRegion(Region region) {
        this.region = region;
    }
}
