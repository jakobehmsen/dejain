package jasy.lang.ast;

import jasy.lang.ASMCompiler.Region;
import java.util.Arrays;

public interface CodeAST extends AST {
    <T> T accept(CodeVisitor<T> visitor);
    default CodeAST concat(CodeAST other) {
//        return new BlockAST(new Region(this.getRegion().start, other.getRegion().end), Arrays.asList(this, other));
        return new BlockAST(null, Arrays.asList(this, other));
    }
}
