// This is a generated file. Not intended for manual editing.
package com.modusbox.portx.datasonnet.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DataSonnetCompspec extends PsiElement {

  @NotNull
  List<DataSonnetForspec> getForspecList();

  @NotNull
  List<DataSonnetIfspec> getIfspecList();

}
