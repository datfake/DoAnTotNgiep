<template>
  <v-theme-provider :dark="dark">
    <div>
      <base-img
        :src="require('@/assets/zero-logo-dark.svg')"
        contain
        max-width="128"
        min-height="78"
        width="100%"
      />

      <base-title
        size="body-1"
        space="4"
        title="Tác giả"
        weight="regular"
      />

      <base-body>
        Website xây dựng dựa trên Vuetify và giao diện được xây dựng dựa trên ý tưởng của website naipot. Mọi thông tin xin liên hệ với tôi. Xin cảm ơn
      </base-body>

      <base-btn
        class="mb-12"
        color="white"
        outlined
      >
        More Info
      </base-btn>
    </div>
  </v-theme-provider>
</template>

<script>
  export default {
    name: 'BaseInfo',

    props: {
      title: String,
      dark: Boolean,
    },

    data: () => ({
      business: [
        {
          icon: 'mdi-map-marker-outline',
          title: 'Address',
          text: '8553 N. Beach St. Ste. 227<br>Fort Worth, Texas 76137',
        },
        {
          icon: 'mdi-cellphone',
          title: 'Phone',
          text: '01 (800) 433 744<br>01 (800) 433 633',
        },
        {
          icon: 'mdi-email',
          title: 'Email',
          text: 'john@vuetifyjs.com<br>heather@vuetifyjs.com',
        },
      ],
    }),
  }
</script>
