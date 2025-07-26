# -------------------------
# Etapa 1: Build do projeto
# -------------------------
FROM node:22-alpine AS build

# Definir diretório de trabalho
WORKDIR /app

# Copiar os arquivos de configuração do projeto
COPY package.json package-lock.json* ./

# Instalar dependências
RUN npm install

# Copiar todo o código do frontend
COPY . .

# Gerar a build de produção
RUN npm run build

# -------------------------
# Etapa 2: Servir com Nginx
# -------------------------
FROM nginx:alpine

# Copiar a build gerada para o diretório padrão do Nginx
COPY --from=build /app/dist /usr/share/nginx/html

# Expor a porta 80
EXPOSE 80

# Comando para iniciar o servidor Nginx
CMD ["nginx", "-g", "daemon off;"]
