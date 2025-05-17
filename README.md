<h3 align="center">Baby Monitor</h3>
<p align="center">monitore seus filhos</p>

---

## 👶 Sobre o projeto

O **Baby Monitor** é um aplicativo Android nativo para monitoramento de bebês, oferecendo controle de sono, alimentação e outras funcionalidades essenciais para ajudar os pais no dia a dia. É um projeto acadêmico, mas com potencial de uso real.

> \[!NOTE] 
> Este projeto está em desenvolvimento como parte de um trabalho de faculdade. O objetivo é criar um app funcional, acessível e útil para pais de recém-nascidos e bebês.

---

## 🧪 Tech Stack

- 🧠 **Linguagem:** Kotlin
- 🎨 **UI:** Jetpack Compose
- ☁️ **Backend:** Firebase
  - Firebase Authentication (Google Sign-In)
  - Cloud Firestore
  - Firebase Cloud Messaging (Notificações)
- 🌙 **Modo Noturno:** Suporte nativo via Compose
- 📊 **Gráficos:** MPAndroidChart (ou alternativa via Compose)
- 🔄 **Arquitetura:** MVVM + ViewModel + LiveData/StateFlow

---

## ✅ Funcionalidades

- [ ] Autenticação
  - [ ] Login com Google
  - [ ] Criação de perfil (onboarding)
- [ ] Registros e relatórios
  - [ ] Sono
    - [ ] Registro de sono
    - [ ] Relatório de sono
  - [ ] Alimentação
    - [ ] Registro de alimentação
    - [ ] Relatório de alimentação
  - [ ] Troca de fraldas
    - [ ] Registro de troca de fraldas
    - [ ] Relatório de troca de fraldas
  - [ ] Vacinas
    - [ ] Registor de vacinas
    - [ ] Relatório de vacinas 
- [ ] Lembretes
  - [ ] Remédios
  - [ ] Alimentação
- [ ] Acessibilidade
  - [ ] Suporte a modo noturno
  - [ ] Suporte a telas pequenas e grandes (relógios, celulares e tablets)
  - [ ] Integração com Alexa
- [ ] Exportar relatórios em PDF para impressão
- [ ] Integração com calendário (consultas, vacinas)
- [ ] Suporte a múltiplos bebês
- [ ] Sincronização entre cuidadores (multiusuário)

---

## 🚀 Como rodar localmente

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/baby-monitor.git
   cd baby-monitor
   ```
2. Abra o projeto no Android Studio.
3. Configure o Firebase:
   * Crie um projeto no Firebase.
   * Habilite o Firebase Authentication (Google).
   * Configure Firestore e FCM.
   * Baixe o `google-services.json` e coloque em `app/`.
   * Execute o app em um dispositivo ou emulador.

## 📁 Estrutura planejada
```
baby-monitor/
├── app/
│   ├── ui/
│   │   ├── screens/
│   │   ├── components/
│   ├── data/
│   │   ├── repository/
│   │   └── models/
│   ├── firebase/
│   ├── utils/
│   └── MainActivity.kt
├── README.md
```
