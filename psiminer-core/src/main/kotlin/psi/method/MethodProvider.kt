package psi.method

import com.intellij.psi.PsiElement

abstract class MethodProvider {
    abstract fun getNameNode(root: PsiElement): PsiElement
    abstract fun getBody(root: PsiElement): String?
    abstract fun isConstructor(root: PsiElement): Boolean

    open fun hasModifier(root: PsiElement, modifier: String): Boolean = false
    open fun hasAnnotation(root: PsiElement, annotation: String): Boolean = false
}
