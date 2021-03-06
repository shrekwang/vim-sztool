package com.github.vinja.debug.eval;

import org.antlr.runtime.tree.CommonTree;

import com.sun.jdi.BooleanValue;

public class LogicalOr {
	
	public static Object operate(ExpEval expEval, CommonTree leftOp, CommonTree rightOp) {
		Object leftValue = expEval.evalTreeNode(leftOp);
		Object rightValue = expEval.evalTreeNode(rightOp);
		Boolean lv = null; 
		Boolean rv = null; 
		
		if (leftValue instanceof BooleanValue 
				|| leftValue instanceof Boolean ){
			lv = Boolean.parseBoolean(leftValue.toString());
		} 
		if (rightValue instanceof BooleanValue 
				|| rightValue instanceof Boolean ){
			rv = Boolean.parseBoolean(rightValue.toString());
		}
		return lv ||  rv;
	}
}
