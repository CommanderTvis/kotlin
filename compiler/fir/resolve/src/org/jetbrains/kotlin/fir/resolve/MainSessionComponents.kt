/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.resolve

import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.resolve.providers.FirDependenciesSymbolProvider
import org.jetbrains.kotlin.fir.resolve.providers.FirProvider
import org.jetbrains.kotlin.fir.resolve.providers.FirSymbolProvider
import org.jetbrains.kotlin.fir.scopes.impl.FirDeclaredMemberScopeProvider
import org.jetbrains.kotlin.fir.types.FirCorrespondingSupertypesCache

val FirSession.symbolProvider: FirSymbolProvider by FirSession.sessionComponentAccessor()
val FirSession.dependenciesSymbolProvider: FirSymbolProvider by FirSession.sessionComponentAccessor<FirDependenciesSymbolProvider>()
val FirSession.firProvider: FirProvider by FirSession.sessionComponentAccessor()
val FirSession.correspondingSupertypesCache: FirCorrespondingSupertypesCache by FirSession.sessionComponentAccessor()
val FirSession.declaredMemberScopeProvider: FirDeclaredMemberScopeProvider by FirSession.sessionComponentAccessor()
val FirSession.qualifierResolver: FirQualifierResolver by FirSession.sessionComponentAccessor()
val FirSession.typeResolver: FirTypeResolver by FirSession.sessionComponentAccessor()
