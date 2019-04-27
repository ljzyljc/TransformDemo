package com.addtrycatch;

import com.quinn.hunter.transform.asm.BaseWeaver;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import sun.security.krb5.Config;

public class AddTryCatchWeaver extends BaseWeaver {

    @Override
    public boolean isWeavableClass(String fullQualifiedClassName) {
        return com.addtrycatch.Config.getInstance().extension.hookPoint.containsKey(fullQualifiedClassName.replace(".class",""));
    }

    @Override
    protected ClassVisitor wrapClassWriter(ClassWriter classWriter) {
        return new AddTryCatchClassAdapter(classWriter);
    }
}
