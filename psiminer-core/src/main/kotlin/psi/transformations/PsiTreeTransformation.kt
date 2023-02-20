package psi.transformations

import com.intellij.psi.PsiElement

interface PsiTreeTransformation {
    fun transform(root: PsiElement)
}

interface CommonTreeTransformation : PsiTreeTransformation

interface PriTreeModifyingTransformation : PsiTreeTransformation

interface JavaTreeTransformation : PsiTreeTransformation

interface KotlinTreeTransformation : PsiTreeTransformation

interface PhpTreeTransformation : PsiTreeTransformation

interface PhpTreeModifyingTransformation : PriTreeModifyingTransformation
