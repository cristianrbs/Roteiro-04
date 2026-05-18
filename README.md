# Sistema de Agendamento de Consultas Médicas

Sistema desenvolvido em Java para gerenciar o agendamento de consultas médicas, com interface gráfica em Swing e persistência de dados em arquivos CSV.

## Estrutura do Projeto

```
src/main/java/
├── classes/
│   ├── Consulta.java
│   ├── Medico.java
│   └── Paciente.java
├── file/
│   ├── FilePersistence.java
│   ├── SerializacaoCSVConsulta.java
│   ├── SerializacaoCSVMedico.java
│   └── SerializacaoCSVPaciente.java
├── gerentes/
│   ├── GerenciadorConsulta.java
│   ├── GerenciadorMedico.java
│   └── GerenciadorPaciente.java
├── gui/
│   ├── dialogs/
│   │   ├── DlgCadastroPaciente.java
│   │   ├── DlgCadastroMedico.java
│   │   ├── DlgAgendarConsulta.java
│   │   ├── DlgSelecionarPaciente.java
│   │   └── DlgSelecionarMedico.java
│   ├── FrHome.form
│   └── FrHome.java
└── main/
    └── Main.java
```

## Classes

### Paciente
Representa um paciente do sistema.

**Atributos:**
- `String nome`
- `String cpf`
- `String dataNascimento`
- `String historicoMedico`

---

### Medico
Representa um médico do sistema.

**Atributos:**
- `String nome`
- `String crm`
- `String especialidade`
- `String horariosDisponiveis`

---

### Consulta
Representa uma consulta agendada associando um paciente a um médico.

**Atributos:**
- `Paciente paciente`
- `Medico medico`
- `String dataHora` — formato `DD-MM-AAAA`

---

### GerenciadorPaciente
Gerencia a lista de pacientes e sua persistência.

**Métodos:**
- `adicionarPaciente(Paciente p)` — adiciona um paciente
- `removerPaciente(String cpf)` — remove um paciente pelo CPF
- `getPacientes()` — retorna a lista de pacientes
- `salvarNoArquivo(String caminho)` — salva em CSV
- `carregarDoArquivo(String caminho)` — carrega do CSV

---

### GerenciadorMedico
Gerencia a lista de médicos e sua persistência.

**Métodos:**
- `adicionarMedico(Medico m)` — adiciona um médico
- `removerMedico(String crm)` — remove um médico pelo CRM
- `getMedicos()` — retorna a lista de médicos
- `salvarNoArquivo(String caminho)` — salva em CSV
- `carregarDoArquivo(String caminho)` — carrega do CSV

---

### GerenciadorConsulta
Gerencia a lista de consultas agendadas e sua persistência.

**Métodos:**
- `adicionarConsulta(Consulta c)` — adiciona uma consulta
- `removerConsulta(Consulta c)` — remove uma consulta
- `getConsultas()` — retorna a lista de consultas
- `salvarNoArquivo(String caminho)` — salva em CSV
- `carregarDoArquivo(String caminho)` — carrega do CSV

---

### FilePersistence
Classe genérica responsável pela leitura e escrita de arquivos. Funciona com qualquer formato de texto (CSV, JSON, XML).

**Métodos:**
- `saveToFile(String texto, String filePath)` — salva texto em arquivo
- `loadFromFile(String filePath)` — lê e retorna o conteúdo do arquivo

---

### Classes de Serialização CSV
Convertem listas de objetos para o formato CSV e vice-versa.

- `SerializacaoCSVPaciente` — serializa/deserializa pacientes
- `SerializacaoCSVMedico` — serializa/deserializa médicos
- `SerializacaoCSVConsulta` — serializa/deserializa consultas

Cada uma possui os métodos:
- `toCSV(List<T> lista)` — converte lista para String CSV
- `fromCSV(String data)` — converte String CSV para lista

## Interface Gráfica

### FrHome (JFrame)
Janela principal do sistema com acesso a todas as funcionalidades:
- Cadastrar Paciente
- Cadastrar Médico
- Agendar Consulta
- Listar Consultas

### DlgCadastroPaciente (JDialog)
Tela para cadastro de novos pacientes com campos de nome, CPF, data de nascimento e histórico médico.

### DlgCadastroMedico (JDialog)
Tela para cadastro de novos médicos com campos de nome, CRM, especialidade e horários disponíveis.

### DlgAgendarConsulta (JDialog)
Tela para agendamento de consultas. Permite selecionar paciente e médico através de JDialogs modais e definir a data e hora da consulta.

### DlgSelecionarPaciente (JDialog — modal)
Lista todos os pacientes cadastrados para seleção. Bloqueia a tela anterior até que uma escolha seja feita.

### DlgSelecionarMedico (JDialog — modal)
Lista todos os médicos cadastrados para seleção. Bloqueia a tela anterior até que uma escolha seja feita.

## Funcionalidades

- **Cadastro de Pacientes** — nome, CPF, data de nascimento e histórico médico
- **Cadastro de Médicos** — nome, CRM, especialidade e horários disponíveis
- **Agendamento de Consultas** — associa paciente e médico com data e hora
- **Seleção Modal** — uso de `JDialog` com `modal = true` para garantir que a seleção de paciente e médico seja concluída antes de continuar
- **Persistência em CSV** — salva e carrega dados de pacientes, médicos e consultas em arquivos `.csv`

## Conceitos Utilizados

- Orientação a Objetos (classes, encapsulamento, construtores)
- Interface Gráfica com Java Swing (`JFrame`, `JDialog`, `JList`, `JTextField`, `JButton`)
- JDialogs modais para seleção de entidades
- Serialização e desserialização de dados em CSV
- Separação de responsabilidades — modelo, gerenciadores, serialização e GUI em pacotes distintos

## Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto no NetBeans ou na IDE de sua preferência.

3. Execute a classe `Main`.

## Tecnologias

- Java
- Java Swing
- NetBeans IDE
